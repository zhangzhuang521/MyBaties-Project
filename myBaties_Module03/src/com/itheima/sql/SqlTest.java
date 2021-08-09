package com.itheima.sql;


import org.apache.ibatis.jdbc.SQL;

//构建sql语句
public class SqlTest {

    public String getFindAll() {
        String findAll = new SQL() {
            {
                SELECT("*");
                FROM("student");
            }
        }.toString();
        return findAll;
    }

    public String getFindById() {
        String findById = new SQL() {
            {
                SELECT("*");
                FROM("student");
                WHERE("id=#{id}");
            }
        }.toString();
        return findById;
    }

    public String getInsert() {
        String insert = new SQL() {
            {
                INSERT_INTO("student");
                INTO_VALUES("#{id},#{name},#{age}");
            }
        }.toString();
        return insert;
    }

    public String getUpdate() {
        String update = new SQL() {
            {
                UPDATE("student");
                SET("name=#{name},age=#{age}");
                WHERE("id=#{id}");
            }
        }.toString();
        return update;
    }

    public String getDelete() {
        String delete = new SQL() {
            {
               DELETE_FROM("student");
               WHERE("id=#{id}");
            }
        }.toString();
        return delete;
    }

    public String getFindContion() {
        String findContion = new SQL() {
            {
                SELECT("*");
                FROM("student");
            }
        }.toString();
        return findContion;
    }

    public String getFindByIds() {
        String findByIds = new SQL() {
            {
                SELECT("*");
                FROM("student");
                WHERE("id IN (1,3,5,7)");
            }
        }.toString();
        return findByIds;
    }
}
