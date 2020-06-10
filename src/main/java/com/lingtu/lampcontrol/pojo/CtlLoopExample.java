package com.lingtu.lampcontrol.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CtlLoopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtlLoopExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andLoopIdIsNull() {
            addCriterion("loop_id is null");
            return (Criteria) this;
        }

        public Criteria andLoopIdIsNotNull() {
            addCriterion("loop_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoopIdEqualTo(Long value) {
            addCriterion("loop_id =", value, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdNotEqualTo(Long value) {
            addCriterion("loop_id <>", value, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdGreaterThan(Long value) {
            addCriterion("loop_id >", value, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("loop_id >=", value, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdLessThan(Long value) {
            addCriterion("loop_id <", value, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdLessThanOrEqualTo(Long value) {
            addCriterion("loop_id <=", value, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdIn(List<Long> values) {
            addCriterion("loop_id in", values, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdNotIn(List<Long> values) {
            addCriterion("loop_id not in", values, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdBetween(Long value1, Long value2) {
            addCriterion("loop_id between", value1, value2, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdNotBetween(Long value1, Long value2) {
            addCriterion("loop_id not between", value1, value2, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopCodeIsNull() {
            addCriterion("loop_code is null");
            return (Criteria) this;
        }

        public Criteria andLoopCodeIsNotNull() {
            addCriterion("loop_code is not null");
            return (Criteria) this;
        }

        public Criteria andLoopCodeEqualTo(String value) {
            addCriterion("loop_code =", value, "loopCode");
            return (Criteria) this;
        }

        public Criteria andLoopCodeNotEqualTo(String value) {
            addCriterion("loop_code <>", value, "loopCode");
            return (Criteria) this;
        }

        public Criteria andLoopCodeGreaterThan(String value) {
            addCriterion("loop_code >", value, "loopCode");
            return (Criteria) this;
        }

        public Criteria andLoopCodeGreaterThanOrEqualTo(String value) {
            addCriterion("loop_code >=", value, "loopCode");
            return (Criteria) this;
        }

        public Criteria andLoopCodeLessThan(String value) {
            addCriterion("loop_code <", value, "loopCode");
            return (Criteria) this;
        }

        public Criteria andLoopCodeLessThanOrEqualTo(String value) {
            addCriterion("loop_code <=", value, "loopCode");
            return (Criteria) this;
        }

        public Criteria andLoopCodeLike(String value) {
            addCriterion("loop_code like", value, "loopCode");
            return (Criteria) this;
        }

        public Criteria andLoopCodeNotLike(String value) {
            addCriterion("loop_code not like", value, "loopCode");
            return (Criteria) this;
        }

        public Criteria andLoopCodeIn(List<String> values) {
            addCriterion("loop_code in", values, "loopCode");
            return (Criteria) this;
        }

        public Criteria andLoopCodeNotIn(List<String> values) {
            addCriterion("loop_code not in", values, "loopCode");
            return (Criteria) this;
        }

        public Criteria andLoopCodeBetween(String value1, String value2) {
            addCriterion("loop_code between", value1, value2, "loopCode");
            return (Criteria) this;
        }

        public Criteria andLoopCodeNotBetween(String value1, String value2) {
            addCriterion("loop_code not between", value1, value2, "loopCode");
            return (Criteria) this;
        }

        public Criteria andLoopNameIsNull() {
            addCriterion("loop_name is null");
            return (Criteria) this;
        }

        public Criteria andLoopNameIsNotNull() {
            addCriterion("loop_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoopNameEqualTo(String value) {
            addCriterion("loop_name =", value, "loopName");
            return (Criteria) this;
        }

        public Criteria andLoopNameNotEqualTo(String value) {
            addCriterion("loop_name <>", value, "loopName");
            return (Criteria) this;
        }

        public Criteria andLoopNameGreaterThan(String value) {
            addCriterion("loop_name >", value, "loopName");
            return (Criteria) this;
        }

        public Criteria andLoopNameGreaterThanOrEqualTo(String value) {
            addCriterion("loop_name >=", value, "loopName");
            return (Criteria) this;
        }

        public Criteria andLoopNameLessThan(String value) {
            addCriterion("loop_name <", value, "loopName");
            return (Criteria) this;
        }

        public Criteria andLoopNameLessThanOrEqualTo(String value) {
            addCriterion("loop_name <=", value, "loopName");
            return (Criteria) this;
        }

        public Criteria andLoopNameLike(String value) {
            addCriterion("loop_name like", value, "loopName");
            return (Criteria) this;
        }

        public Criteria andLoopNameNotLike(String value) {
            addCriterion("loop_name not like", value, "loopName");
            return (Criteria) this;
        }

        public Criteria andLoopNameIn(List<String> values) {
            addCriterion("loop_name in", values, "loopName");
            return (Criteria) this;
        }

        public Criteria andLoopNameNotIn(List<String> values) {
            addCriterion("loop_name not in", values, "loopName");
            return (Criteria) this;
        }

        public Criteria andLoopNameBetween(String value1, String value2) {
            addCriterion("loop_name between", value1, value2, "loopName");
            return (Criteria) this;
        }

        public Criteria andLoopNameNotBetween(String value1, String value2) {
            addCriterion("loop_name not between", value1, value2, "loopName");
            return (Criteria) this;
        }

        public Criteria andSuppliersIsNull() {
            addCriterion("suppliers is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersIsNotNull() {
            addCriterion("suppliers is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersEqualTo(String value) {
            addCriterion("suppliers =", value, "suppliers");
            return (Criteria) this;
        }

        public Criteria andSuppliersNotEqualTo(String value) {
            addCriterion("suppliers <>", value, "suppliers");
            return (Criteria) this;
        }

        public Criteria andSuppliersGreaterThan(String value) {
            addCriterion("suppliers >", value, "suppliers");
            return (Criteria) this;
        }

        public Criteria andSuppliersGreaterThanOrEqualTo(String value) {
            addCriterion("suppliers >=", value, "suppliers");
            return (Criteria) this;
        }

        public Criteria andSuppliersLessThan(String value) {
            addCriterion("suppliers <", value, "suppliers");
            return (Criteria) this;
        }

        public Criteria andSuppliersLessThanOrEqualTo(String value) {
            addCriterion("suppliers <=", value, "suppliers");
            return (Criteria) this;
        }

        public Criteria andSuppliersLike(String value) {
            addCriterion("suppliers like", value, "suppliers");
            return (Criteria) this;
        }

        public Criteria andSuppliersNotLike(String value) {
            addCriterion("suppliers not like", value, "suppliers");
            return (Criteria) this;
        }

        public Criteria andSuppliersIn(List<String> values) {
            addCriterion("suppliers in", values, "suppliers");
            return (Criteria) this;
        }

        public Criteria andSuppliersNotIn(List<String> values) {
            addCriterion("suppliers not in", values, "suppliers");
            return (Criteria) this;
        }

        public Criteria andSuppliersBetween(String value1, String value2) {
            addCriterion("suppliers between", value1, value2, "suppliers");
            return (Criteria) this;
        }

        public Criteria andSuppliersNotBetween(String value1, String value2) {
            addCriterion("suppliers not between", value1, value2, "suppliers");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRecycleIsNull() {
            addCriterion("recycle is null");
            return (Criteria) this;
        }

        public Criteria andRecycleIsNotNull() {
            addCriterion("recycle is not null");
            return (Criteria) this;
        }

        public Criteria andRecycleEqualTo(String value) {
            addCriterion("recycle =", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleNotEqualTo(String value) {
            addCriterion("recycle <>", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleGreaterThan(String value) {
            addCriterion("recycle >", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleGreaterThanOrEqualTo(String value) {
            addCriterion("recycle >=", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleLessThan(String value) {
            addCriterion("recycle <", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleLessThanOrEqualTo(String value) {
            addCriterion("recycle <=", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleLike(String value) {
            addCriterion("recycle like", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleNotLike(String value) {
            addCriterion("recycle not like", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleIn(List<String> values) {
            addCriterion("recycle in", values, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleNotIn(List<String> values) {
            addCriterion("recycle not in", values, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleBetween(String value1, String value2) {
            addCriterion("recycle between", value1, value2, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleNotBetween(String value1, String value2) {
            addCriterion("recycle not between", value1, value2, "recycle");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}