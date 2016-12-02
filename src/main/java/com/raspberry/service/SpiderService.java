package com.raspberry.service;

import com.raspberry.model.SpiderUser;
import com.raspberry.vo.SpiderVO;

/**
* @author zyl
* @date 2016年12月1日 下午5:05:09
* @describe
*/
public interface SpiderService {

	 /**
     * 保存用户信息
     * @param user
     * @return
     */
    public int saveUser(SpiderUser user);
    /**
     * 查询用户信息
     * @param user
     * @return
     */
    SpiderVO<SpiderUser> findSpiderDeatil(SpiderVO<SpiderUser> spiderVO);
}
