package com.raspberry.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.raspberry.dao.SpiderMapper;
import com.raspberry.model.SpiderUser;
import com.raspberry.service.SpiderService;
import com.raspberry.vo.SpiderVO;

/**
* @author zyl
* @date 2016年12月1日 下午5:05:09
* @describe
*/
@Service
public class SpiderServiceImpl implements  SpiderService{

	@Resource
    private SpiderMapper spiderMapper;
	/**
     * 保存用户信息
     * @param user
     * @return
     */
	@Override
	public int saveUser(SpiderUser user) {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
     * 查询用户信息
     * @param user
     * @return
     */
	@Override
	public SpiderVO<SpiderUser> findSpiderDeatil(SpiderVO<SpiderUser> spiderVO) {
		// 得到总条数
		int count = spiderMapper.findCount(spiderVO);
		spiderVO.getPageModel().setTotalCount(count);
		List<SpiderUser> spiderDetail = spiderMapper.findSpiderDeatil(spiderVO);
		spiderVO.setResult(spiderDetail);
		return spiderVO;
	}
	
}
