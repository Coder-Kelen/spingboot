package com.cgx.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName:User
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/5/18 16:23
 * @Version:1.0
 */
@Component
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 2174846779101028638L;
    @Id
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "valid_date")
    private String validDate;
    @Column(name = "dept_id")
    private Integer dept_id;
}
