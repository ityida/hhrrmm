package com.ihrm.company.dao;

import com.ihrm.domain.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/5/8
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CompanyDaoTest {
    @Autowired
    CompanyDao companyDao;

    @Test
    public void get() {
        Company company = companyDao.findById("1").get();
        System.out.println(company);
    }
}