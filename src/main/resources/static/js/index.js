/**
 * @fileName index.js
 * @description 主页js脚本
 * @author 马帅
 * @date 2020/3/12 21:55
 * @version 1.0
 */

layui.use(['element', 'jquery','layer','table','form'], function () {
    let element = layui.element, $ = layui.jquery, layer = layui.layer, form = layui.form;

    // 首页动态时间
    dynamicTime();

    // 多级菜单显示
    $(".menu_three").on("click", function () {

        $(this).next().toggle();
        $.each($(this).parent().siblings(), function (i, e) {
            $(e).find("ol").hide();
        });

    });

    // 子菜单点击事件
    $("ol").on("click", "li a", function () {
        $.each($(this).parent().siblings(), function (i, e) {
            $(e).find("a").removeClass('three_this');

        });

        // 添加当前元素的样式
        $(this).addClass('three_this');
    });


    // 选项卡功能
    element.on('nav(test)', function(data){
        let isHas = true;
        $('.layui-tab-title li').each(function () {
            if($(this).attr('lay-id') === $(data[0]).attr('lay-id')){
                isHas = false;
            }
        });

        if($(data[0]).attr('lay-id')){
            let flag=true;
            $('.index_main').find('.layui-tab-title>li').each(function(i,v){
                if($(v).attr('lay-id')===$(data[0]).attr('lay-id')){
                    flag=false;
                }
            });
            if(flag){
                element.tabAdd('test1', {
                    title:$(data[0]).text(),
                    content:'<iframe src="'+$(data[0]).attr('lay-url')+'" frameborder="0" style="width:100%;height:100%"></iframe>',
                    id:$(data[0]).attr('lay-id')
                });
            }else {
                element.tabChange('test1', $(data[0]).attr('lay-id'));
            }
        }

        element.tabChange('test1', $(data[0]).attr('lay-id'));

    });


    // 监听鼠标事件，账号被迫退出提醒
    /*window.addEventListener('mousedown', function () {
        whetherOnline();
    });*/



});

/**
 * 首页动态时间
 */
function dynamicTime(){
    setInterval("document.getElementById('newTime').innerHTML = new Date().toLocaleString()+' 星期'+'日一二三四五六'.charAt(new Date().getDay());",
        100);
}

/**
 * 判断是否在线
 */
function whetherOnline(){
    let flag = true;

    $.ajax({
        url: "/login/whetherOnline",
        type: 'POST',
        data: {
            sessionId : $("#sessionId").val()
        },
        success: function (data) {
            if (data.code !== 200) {
                if (flag) {
                    window.removeEventListener("mousedown", arguments.callee);
                    flag = false;
                    layer.msg('此账号在其它地方登录，您已被迫下线！', {
                        icon: 7,
                        time: 1000
                    }, function(){
                        window.location.href = "/login";
                    });

                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

    });
}

/**
 * 监听浏览器关闭事件（IE除外），关闭浏览器退出账户
 * @param e
 */
function closeWindow(e) {
    let browser = getweb();
    if ("IE" === browser) {
        return;
    }
    window.onunload = function () {
        console.log("浏览器关闭起作用");
        $.get({
            url: '/login/loginout'
        });
    };
}

/**
 * 获取浏览器类型
 * @returns {string}
 */
function getweb() {
    if (!!window.ActiveXObject || "ActiveXObject" in window) {
        return "IE";
    }
    if (navigator.userAgent.indexOf("Firefox") > -1) {
        return "Firefox";
    }
    if (navigator.userAgent.indexOf("Chrome") > -1) {
        return "Chrome";
    }
    if (navigator.userAgent.indexOf("Safari") > -1) {
        return "Safari";
    }
}

function chooseRole(roleId){
    $.ajax({
        url: "/chooseRole",
        type: 'post',
        data: {
            roleId : roleId
        },
        success: function (data) {
            if (data.code === 200) {
                window.location.href = '/index';
            }
        }

    });
}