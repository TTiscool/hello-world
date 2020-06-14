package com.example.hello.world.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@TableName(value = "logistics")
@Data
@Document(indexName="ttiscool",type="logistics")
public class  Logistics {
    @TableField(fill = FieldFill.INSERT)
    @TableId(value = "id", type = IdType.INPUT)
    @Field(type = FieldType.Long)
    private Long id;

    @TableField(value = "ecode")
    @Field(type = FieldType.Keyword)
    private String ecode;


    private String ename;

    private String shortName;

    private String logisticsType;

    private String mailnoRegular;

    private String accountNo;

    private String password;

    private String payType;

    private Integer expressType;

    private String monthlyCardNo;

    private Integer weightType;

    private String sendCityCode;

    private String url;

    private String cainiaoUrl;

    private Long adOrgId;

    private String isactive;

    private Long adClientId;

    private Long ownerid;

    private String ownerename;

    private String ownername;

    private Date creationdate;

    private Long modifierid;

    private String modifierename;

    private String modifiername;

    private Date modifieddate;

}
