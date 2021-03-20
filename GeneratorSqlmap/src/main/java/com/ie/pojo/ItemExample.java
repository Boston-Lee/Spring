package com.ie.pojo;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andScnumIsNull() {
            addCriterion("scNum is null");
            return (Criteria) this;
        }

        public Criteria andScnumIsNotNull() {
            addCriterion("scNum is not null");
            return (Criteria) this;
        }

        public Criteria andScnumEqualTo(Integer value) {
            addCriterion("scNum =", value, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumNotEqualTo(Integer value) {
            addCriterion("scNum <>", value, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumGreaterThan(Integer value) {
            addCriterion("scNum >", value, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("scNum >=", value, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumLessThan(Integer value) {
            addCriterion("scNum <", value, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumLessThanOrEqualTo(Integer value) {
            addCriterion("scNum <=", value, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumIn(List<Integer> values) {
            addCriterion("scNum in", values, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumNotIn(List<Integer> values) {
            addCriterion("scNum not in", values, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumBetween(Integer value1, Integer value2) {
            addCriterion("scNum between", value1, value2, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumNotBetween(Integer value1, Integer value2) {
            addCriterion("scNum not between", value1, value2, "scnum");
            return (Criteria) this;
        }

        public Criteria andGmnumIsNull() {
            addCriterion("gmNum is null");
            return (Criteria) this;
        }

        public Criteria andGmnumIsNotNull() {
            addCriterion("gmNum is not null");
            return (Criteria) this;
        }

        public Criteria andGmnumEqualTo(Integer value) {
            addCriterion("gmNum =", value, "gmnum");
            return (Criteria) this;
        }

        public Criteria andGmnumNotEqualTo(Integer value) {
            addCriterion("gmNum <>", value, "gmnum");
            return (Criteria) this;
        }

        public Criteria andGmnumGreaterThan(Integer value) {
            addCriterion("gmNum >", value, "gmnum");
            return (Criteria) this;
        }

        public Criteria andGmnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("gmNum >=", value, "gmnum");
            return (Criteria) this;
        }

        public Criteria andGmnumLessThan(Integer value) {
            addCriterion("gmNum <", value, "gmnum");
            return (Criteria) this;
        }

        public Criteria andGmnumLessThanOrEqualTo(Integer value) {
            addCriterion("gmNum <=", value, "gmnum");
            return (Criteria) this;
        }

        public Criteria andGmnumIn(List<Integer> values) {
            addCriterion("gmNum in", values, "gmnum");
            return (Criteria) this;
        }

        public Criteria andGmnumNotIn(List<Integer> values) {
            addCriterion("gmNum not in", values, "gmnum");
            return (Criteria) this;
        }

        public Criteria andGmnumBetween(Integer value1, Integer value2) {
            addCriterion("gmNum between", value1, value2, "gmnum");
            return (Criteria) this;
        }

        public Criteria andGmnumNotBetween(Integer value1, Integer value2) {
            addCriterion("gmNum not between", value1, value2, "gmnum");
            return (Criteria) this;
        }

        public Criteria andUrl1IsNull() {
            addCriterion("url1 is null");
            return (Criteria) this;
        }

        public Criteria andUrl1IsNotNull() {
            addCriterion("url1 is not null");
            return (Criteria) this;
        }

        public Criteria andUrl1EqualTo(String value) {
            addCriterion("url1 =", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1NotEqualTo(String value) {
            addCriterion("url1 <>", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1GreaterThan(String value) {
            addCriterion("url1 >", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("url1 >=", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1LessThan(String value) {
            addCriterion("url1 <", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1LessThanOrEqualTo(String value) {
            addCriterion("url1 <=", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1Like(String value) {
            addCriterion("url1 like", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1NotLike(String value) {
            addCriterion("url1 not like", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1In(List<String> values) {
            addCriterion("url1 in", values, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1NotIn(List<String> values) {
            addCriterion("url1 not in", values, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1Between(String value1, String value2) {
            addCriterion("url1 between", value1, value2, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1NotBetween(String value1, String value2) {
            addCriterion("url1 not between", value1, value2, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl2IsNull() {
            addCriterion("url2 is null");
            return (Criteria) this;
        }

        public Criteria andUrl2IsNotNull() {
            addCriterion("url2 is not null");
            return (Criteria) this;
        }

        public Criteria andUrl2EqualTo(String value) {
            addCriterion("url2 =", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2NotEqualTo(String value) {
            addCriterion("url2 <>", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2GreaterThan(String value) {
            addCriterion("url2 >", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("url2 >=", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2LessThan(String value) {
            addCriterion("url2 <", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2LessThanOrEqualTo(String value) {
            addCriterion("url2 <=", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2Like(String value) {
            addCriterion("url2 like", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2NotLike(String value) {
            addCriterion("url2 not like", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2In(List<String> values) {
            addCriterion("url2 in", values, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2NotIn(List<String> values) {
            addCriterion("url2 not in", values, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2Between(String value1, String value2) {
            addCriterion("url2 between", value1, value2, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2NotBetween(String value1, String value2) {
            addCriterion("url2 not between", value1, value2, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl3IsNull() {
            addCriterion("url3 is null");
            return (Criteria) this;
        }

        public Criteria andUrl3IsNotNull() {
            addCriterion("url3 is not null");
            return (Criteria) this;
        }

        public Criteria andUrl3EqualTo(String value) {
            addCriterion("url3 =", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3NotEqualTo(String value) {
            addCriterion("url3 <>", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3GreaterThan(String value) {
            addCriterion("url3 >", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3GreaterThanOrEqualTo(String value) {
            addCriterion("url3 >=", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3LessThan(String value) {
            addCriterion("url3 <", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3LessThanOrEqualTo(String value) {
            addCriterion("url3 <=", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3Like(String value) {
            addCriterion("url3 like", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3NotLike(String value) {
            addCriterion("url3 not like", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3In(List<String> values) {
            addCriterion("url3 in", values, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3NotIn(List<String> values) {
            addCriterion("url3 not in", values, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3Between(String value1, String value2) {
            addCriterion("url3 between", value1, value2, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3NotBetween(String value1, String value2) {
            addCriterion("url3 not between", value1, value2, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl4IsNull() {
            addCriterion("url4 is null");
            return (Criteria) this;
        }

        public Criteria andUrl4IsNotNull() {
            addCriterion("url4 is not null");
            return (Criteria) this;
        }

        public Criteria andUrl4EqualTo(String value) {
            addCriterion("url4 =", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4NotEqualTo(String value) {
            addCriterion("url4 <>", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4GreaterThan(String value) {
            addCriterion("url4 >", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4GreaterThanOrEqualTo(String value) {
            addCriterion("url4 >=", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4LessThan(String value) {
            addCriterion("url4 <", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4LessThanOrEqualTo(String value) {
            addCriterion("url4 <=", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4Like(String value) {
            addCriterion("url4 like", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4NotLike(String value) {
            addCriterion("url4 not like", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4In(List<String> values) {
            addCriterion("url4 in", values, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4NotIn(List<String> values) {
            addCriterion("url4 not in", values, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4Between(String value1, String value2) {
            addCriterion("url4 between", value1, value2, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4NotBetween(String value1, String value2) {
            addCriterion("url4 not between", value1, value2, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl5IsNull() {
            addCriterion("url5 is null");
            return (Criteria) this;
        }

        public Criteria andUrl5IsNotNull() {
            addCriterion("url5 is not null");
            return (Criteria) this;
        }

        public Criteria andUrl5EqualTo(String value) {
            addCriterion("url5 =", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5NotEqualTo(String value) {
            addCriterion("url5 <>", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5GreaterThan(String value) {
            addCriterion("url5 >", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5GreaterThanOrEqualTo(String value) {
            addCriterion("url5 >=", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5LessThan(String value) {
            addCriterion("url5 <", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5LessThanOrEqualTo(String value) {
            addCriterion("url5 <=", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5Like(String value) {
            addCriterion("url5 like", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5NotLike(String value) {
            addCriterion("url5 not like", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5In(List<String> values) {
            addCriterion("url5 in", values, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5NotIn(List<String> values) {
            addCriterion("url5 not in", values, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5Between(String value1, String value2) {
            addCriterion("url5 between", value1, value2, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5NotBetween(String value1, String value2) {
            addCriterion("url5 not between", value1, value2, "url5");
            return (Criteria) this;
        }

        public Criteria andPam1IsNull() {
            addCriterion("pam1 is null");
            return (Criteria) this;
        }

        public Criteria andPam1IsNotNull() {
            addCriterion("pam1 is not null");
            return (Criteria) this;
        }

        public Criteria andPam1EqualTo(String value) {
            addCriterion("pam1 =", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1NotEqualTo(String value) {
            addCriterion("pam1 <>", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1GreaterThan(String value) {
            addCriterion("pam1 >", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1GreaterThanOrEqualTo(String value) {
            addCriterion("pam1 >=", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1LessThan(String value) {
            addCriterion("pam1 <", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1LessThanOrEqualTo(String value) {
            addCriterion("pam1 <=", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1Like(String value) {
            addCriterion("pam1 like", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1NotLike(String value) {
            addCriterion("pam1 not like", value, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1In(List<String> values) {
            addCriterion("pam1 in", values, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1NotIn(List<String> values) {
            addCriterion("pam1 not in", values, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1Between(String value1, String value2) {
            addCriterion("pam1 between", value1, value2, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam1NotBetween(String value1, String value2) {
            addCriterion("pam1 not between", value1, value2, "pam1");
            return (Criteria) this;
        }

        public Criteria andPam2IsNull() {
            addCriterion("pam2 is null");
            return (Criteria) this;
        }

        public Criteria andPam2IsNotNull() {
            addCriterion("pam2 is not null");
            return (Criteria) this;
        }

        public Criteria andPam2EqualTo(String value) {
            addCriterion("pam2 =", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2NotEqualTo(String value) {
            addCriterion("pam2 <>", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2GreaterThan(String value) {
            addCriterion("pam2 >", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2GreaterThanOrEqualTo(String value) {
            addCriterion("pam2 >=", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2LessThan(String value) {
            addCriterion("pam2 <", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2LessThanOrEqualTo(String value) {
            addCriterion("pam2 <=", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2Like(String value) {
            addCriterion("pam2 like", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2NotLike(String value) {
            addCriterion("pam2 not like", value, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2In(List<String> values) {
            addCriterion("pam2 in", values, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2NotIn(List<String> values) {
            addCriterion("pam2 not in", values, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2Between(String value1, String value2) {
            addCriterion("pam2 between", value1, value2, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam2NotBetween(String value1, String value2) {
            addCriterion("pam2 not between", value1, value2, "pam2");
            return (Criteria) this;
        }

        public Criteria andPam3IsNull() {
            addCriterion("pam3 is null");
            return (Criteria) this;
        }

        public Criteria andPam3IsNotNull() {
            addCriterion("pam3 is not null");
            return (Criteria) this;
        }

        public Criteria andPam3EqualTo(String value) {
            addCriterion("pam3 =", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3NotEqualTo(String value) {
            addCriterion("pam3 <>", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3GreaterThan(String value) {
            addCriterion("pam3 >", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3GreaterThanOrEqualTo(String value) {
            addCriterion("pam3 >=", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3LessThan(String value) {
            addCriterion("pam3 <", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3LessThanOrEqualTo(String value) {
            addCriterion("pam3 <=", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3Like(String value) {
            addCriterion("pam3 like", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3NotLike(String value) {
            addCriterion("pam3 not like", value, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3In(List<String> values) {
            addCriterion("pam3 in", values, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3NotIn(List<String> values) {
            addCriterion("pam3 not in", values, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3Between(String value1, String value2) {
            addCriterion("pam3 between", value1, value2, "pam3");
            return (Criteria) this;
        }

        public Criteria andPam3NotBetween(String value1, String value2) {
            addCriterion("pam3 not between", value1, value2, "pam3");
            return (Criteria) this;
        }

        public Criteria andVal3IsNull() {
            addCriterion("val3 is null");
            return (Criteria) this;
        }

        public Criteria andVal3IsNotNull() {
            addCriterion("val3 is not null");
            return (Criteria) this;
        }

        public Criteria andVal3EqualTo(String value) {
            addCriterion("val3 =", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3NotEqualTo(String value) {
            addCriterion("val3 <>", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3GreaterThan(String value) {
            addCriterion("val3 >", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3GreaterThanOrEqualTo(String value) {
            addCriterion("val3 >=", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3LessThan(String value) {
            addCriterion("val3 <", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3LessThanOrEqualTo(String value) {
            addCriterion("val3 <=", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3Like(String value) {
            addCriterion("val3 like", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3NotLike(String value) {
            addCriterion("val3 not like", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3In(List<String> values) {
            addCriterion("val3 in", values, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3NotIn(List<String> values) {
            addCriterion("val3 not in", values, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3Between(String value1, String value2) {
            addCriterion("val3 between", value1, value2, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3NotBetween(String value1, String value2) {
            addCriterion("val3 not between", value1, value2, "val3");
            return (Criteria) this;
        }

        public Criteria andVal2IsNull() {
            addCriterion("val2 is null");
            return (Criteria) this;
        }

        public Criteria andVal2IsNotNull() {
            addCriterion("val2 is not null");
            return (Criteria) this;
        }

        public Criteria andVal2EqualTo(String value) {
            addCriterion("val2 =", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2NotEqualTo(String value) {
            addCriterion("val2 <>", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2GreaterThan(String value) {
            addCriterion("val2 >", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2GreaterThanOrEqualTo(String value) {
            addCriterion("val2 >=", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2LessThan(String value) {
            addCriterion("val2 <", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2LessThanOrEqualTo(String value) {
            addCriterion("val2 <=", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2Like(String value) {
            addCriterion("val2 like", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2NotLike(String value) {
            addCriterion("val2 not like", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2In(List<String> values) {
            addCriterion("val2 in", values, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2NotIn(List<String> values) {
            addCriterion("val2 not in", values, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2Between(String value1, String value2) {
            addCriterion("val2 between", value1, value2, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2NotBetween(String value1, String value2) {
            addCriterion("val2 not between", value1, value2, "val2");
            return (Criteria) this;
        }

        public Criteria andVal1IsNull() {
            addCriterion("val1 is null");
            return (Criteria) this;
        }

        public Criteria andVal1IsNotNull() {
            addCriterion("val1 is not null");
            return (Criteria) this;
        }

        public Criteria andVal1EqualTo(String value) {
            addCriterion("val1 =", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1NotEqualTo(String value) {
            addCriterion("val1 <>", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1GreaterThan(String value) {
            addCriterion("val1 >", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1GreaterThanOrEqualTo(String value) {
            addCriterion("val1 >=", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1LessThan(String value) {
            addCriterion("val1 <", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1LessThanOrEqualTo(String value) {
            addCriterion("val1 <=", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1Like(String value) {
            addCriterion("val1 like", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1NotLike(String value) {
            addCriterion("val1 not like", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1In(List<String> values) {
            addCriterion("val1 in", values, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1NotIn(List<String> values) {
            addCriterion("val1 not in", values, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1Between(String value1, String value2) {
            addCriterion("val1 between", value1, value2, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1NotBetween(String value1, String value2) {
            addCriterion("val1 not between", value1, value2, "val1");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andZkIsNull() {
            addCriterion("zk is null");
            return (Criteria) this;
        }

        public Criteria andZkIsNotNull() {
            addCriterion("zk is not null");
            return (Criteria) this;
        }

        public Criteria andZkEqualTo(Integer value) {
            addCriterion("zk =", value, "zk");
            return (Criteria) this;
        }

        public Criteria andZkNotEqualTo(Integer value) {
            addCriterion("zk <>", value, "zk");
            return (Criteria) this;
        }

        public Criteria andZkGreaterThan(Integer value) {
            addCriterion("zk >", value, "zk");
            return (Criteria) this;
        }

        public Criteria andZkGreaterThanOrEqualTo(Integer value) {
            addCriterion("zk >=", value, "zk");
            return (Criteria) this;
        }

        public Criteria andZkLessThan(Integer value) {
            addCriterion("zk <", value, "zk");
            return (Criteria) this;
        }

        public Criteria andZkLessThanOrEqualTo(Integer value) {
            addCriterion("zk <=", value, "zk");
            return (Criteria) this;
        }

        public Criteria andZkIn(List<Integer> values) {
            addCriterion("zk in", values, "zk");
            return (Criteria) this;
        }

        public Criteria andZkNotIn(List<Integer> values) {
            addCriterion("zk not in", values, "zk");
            return (Criteria) this;
        }

        public Criteria andZkBetween(Integer value1, Integer value2) {
            addCriterion("zk between", value1, value2, "zk");
            return (Criteria) this;
        }

        public Criteria andZkNotBetween(Integer value1, Integer value2) {
            addCriterion("zk not between", value1, value2, "zk");
            return (Criteria) this;
        }

        public Criteria andCategoryIdOneIsNull() {
            addCriterion("category_id_one is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdOneIsNotNull() {
            addCriterion("category_id_one is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdOneEqualTo(Integer value) {
            addCriterion("category_id_one =", value, "categoryIdOne");
            return (Criteria) this;
        }

        public Criteria andCategoryIdOneNotEqualTo(Integer value) {
            addCriterion("category_id_one <>", value, "categoryIdOne");
            return (Criteria) this;
        }

        public Criteria andCategoryIdOneGreaterThan(Integer value) {
            addCriterion("category_id_one >", value, "categoryIdOne");
            return (Criteria) this;
        }

        public Criteria andCategoryIdOneGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id_one >=", value, "categoryIdOne");
            return (Criteria) this;
        }

        public Criteria andCategoryIdOneLessThan(Integer value) {
            addCriterion("category_id_one <", value, "categoryIdOne");
            return (Criteria) this;
        }

        public Criteria andCategoryIdOneLessThanOrEqualTo(Integer value) {
            addCriterion("category_id_one <=", value, "categoryIdOne");
            return (Criteria) this;
        }

        public Criteria andCategoryIdOneIn(List<Integer> values) {
            addCriterion("category_id_one in", values, "categoryIdOne");
            return (Criteria) this;
        }

        public Criteria andCategoryIdOneNotIn(List<Integer> values) {
            addCriterion("category_id_one not in", values, "categoryIdOne");
            return (Criteria) this;
        }

        public Criteria andCategoryIdOneBetween(Integer value1, Integer value2) {
            addCriterion("category_id_one between", value1, value2, "categoryIdOne");
            return (Criteria) this;
        }

        public Criteria andCategoryIdOneNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id_one not between", value1, value2, "categoryIdOne");
            return (Criteria) this;
        }

        public Criteria andCategoryIdTwoIsNull() {
            addCriterion("category_id_two is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdTwoIsNotNull() {
            addCriterion("category_id_two is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdTwoEqualTo(Integer value) {
            addCriterion("category_id_two =", value, "categoryIdTwo");
            return (Criteria) this;
        }

        public Criteria andCategoryIdTwoNotEqualTo(Integer value) {
            addCriterion("category_id_two <>", value, "categoryIdTwo");
            return (Criteria) this;
        }

        public Criteria andCategoryIdTwoGreaterThan(Integer value) {
            addCriterion("category_id_two >", value, "categoryIdTwo");
            return (Criteria) this;
        }

        public Criteria andCategoryIdTwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id_two >=", value, "categoryIdTwo");
            return (Criteria) this;
        }

        public Criteria andCategoryIdTwoLessThan(Integer value) {
            addCriterion("category_id_two <", value, "categoryIdTwo");
            return (Criteria) this;
        }

        public Criteria andCategoryIdTwoLessThanOrEqualTo(Integer value) {
            addCriterion("category_id_two <=", value, "categoryIdTwo");
            return (Criteria) this;
        }

        public Criteria andCategoryIdTwoIn(List<Integer> values) {
            addCriterion("category_id_two in", values, "categoryIdTwo");
            return (Criteria) this;
        }

        public Criteria andCategoryIdTwoNotIn(List<Integer> values) {
            addCriterion("category_id_two not in", values, "categoryIdTwo");
            return (Criteria) this;
        }

        public Criteria andCategoryIdTwoBetween(Integer value1, Integer value2) {
            addCriterion("category_id_two between", value1, value2, "categoryIdTwo");
            return (Criteria) this;
        }

        public Criteria andCategoryIdTwoNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id_two not between", value1, value2, "categoryIdTwo");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
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