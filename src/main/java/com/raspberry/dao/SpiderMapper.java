package com.raspberry.dao;

import java.util.List;

import com.raspberry.model.SpiderUser;
import com.raspberry.vo.SpiderVO;

/**
* @author zyl
* @date 2016年12月1日 
* @describe
*/
public interface SpiderMapper {
	/**
     * 保存用户信息
     * @param user
     * @return
     */
	int findCount(SpiderVO<SpiderUser> deptVO);
	/**
     * 查询用户信息
     * @param user
     * @return
     */
	List<SpiderUser> findSpiderDeatil(SpiderVO<SpiderUser> deptVO);

}
