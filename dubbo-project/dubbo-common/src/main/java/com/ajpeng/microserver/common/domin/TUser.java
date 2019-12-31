package com.ajpeng.microserver.common.domin;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "t_user")
@EntityListeners(AuditingEntityListener.class)
public class TUser implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    @Column(length = 128)
    private String name;

    private int age;

    @Column(length = 1)
    private String sex;

    @CreatedDate
    @Column(updatable = false, nullable = false, length = 19)
    private Date createTime;

    @LastModifiedDate
    @Column(nullable = false, length = 19)
    private Date updateTime;

    @Column(columnDefinition = "int default 1")
    private int version;

}
