/**
 * @filename:UserT UserT
 * @project hellow-orld  V1.0
 * Copyright(c) 2018 123123 Co. Ltd. 
 * All right reserved. 
 */
package com.example.hello.world.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;

/**   
 * Copyright: Copyright (c) 2019 
 * 
 * <p>说明： 用户表实体类</P>
 * @version: V1.0
 * @author: 123123
 * 
 * Modification History:
 * Date         	Author          Version          Description
 *---------------------------------------------------------------*
 * UserT      123123    V1.0           initialize
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserT extends Model<UserT> {

	private static final long serialVersionUID = 1591867317198L;
	
	@ApiModelProperty(name = "age" , value = "")
	private Integer age;
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(name = "id" , value = "")
	private Integer id;
	@ApiModelProperty(name = "password" , value = "")
	private String password;
	@ApiModelProperty(name = "userName" , value = "")
	private String userName;
	@Override
    protected Serializable pkVal() {
        return this.id;
    }
}
