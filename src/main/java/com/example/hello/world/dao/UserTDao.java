/**
 * @filename:UserTDao UserT
 * @project hellow-orld  V1.0
 * Copyright(c) 2018 123123 Co. Ltd. 
 * All right reserved. 
 */
package com.example.hello.world.dao;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.example.hello.world.entity.UserT;

/**   
 * Copyright: Copyright (c) 2019 
 * 
 * <p>说明： 用户表数据访问层</P>
 * @version: V1.0
 * @author: 123123
 * 
 * Modification History:
 * Date         	Author          Version          Description
 *---------------------------------------------------------------*
 * UserT      123123    V1.0         initialize
 */
@Mapper
public interface UserTDao extends BaseMapper<UserT> {
	
}
