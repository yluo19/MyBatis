package com.Yuro.dao;

import com.Yuro.entity.Users;
import com.Yuro.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UsersDAO {

    private SqlSession sqlSession;

    private List<Users> list;

    private Users user;

    private SqlSession getSqlSession(){

        sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        return sqlSession;
        }

    public List<Users> findAll() {

        try {
            list = getSqlSession().selectList("findAll");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

        return list;

    }

    public Users findById(Long id) {

        try {
            user = getSqlSession().selectOne("findById",id);
        }catch (Exception e){
         e.printStackTrace();
        }finally {
            sqlSession.close();
        }

        return user;




    }
}
