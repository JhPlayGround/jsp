package com.example.jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.jdbc.vo.GoodsItemVO;

@Repository
public class GoodsItemDaoImpl implements GoodsItemDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	//1. 전체 table select 
	@Override
	public List<GoodsItemVO> findALL()
	{
		String sql = "select * from goodsItem order by item_id asc";
		
		
		return jdbcTemplate.query(sql, new RowMapper<GoodsItemVO>()
		{
			//query(sql, rowMapper) : call back method (메소드가 다른 메소드를 호출)
			
			@Override
			public GoodsItemVO mapRow(ResultSet rs, int rowNum) throws SQLException
			{
				//rs : 1row를 적재, rowNum : 레코드의 번호를 저장
				GoodsItemVO vo = new GoodsItemVO();
				vo.setItem_id(rs.getInt("item_id"));
				vo.setItem_name(rs.getString("item_name"));
				vo.setItem_price(rs.getInt("item_price"));
				vo.setItem_des(rs.getString("item_des"));
				vo.setItem_pic(rs.getString("item_pic"));
				return vo; //1row 반환
			} //mapRow end
		}); //query end
	}//method end

	//2. 조건 검색
	@Override
	public GoodsItemVO findItem(int item_id)
	{
		String sql = "select * from goodsItem where item_id=?";
		
		//하나의 컬럼 검색은 queryForObject
		return jdbcTemplate.queryForObject(sql, new RowMapper<GoodsItemVO>()
		{
			//query(sql, rowMapper) : call back method (메소드가 다른 메소드를 호출)
			
			@Override
			public GoodsItemVO mapRow(ResultSet rs, int rowNum) throws SQLException
			{
				//rs : 1row를 적재, rowNum : 레코드의 번호를 저장
				GoodsItemVO vo = new GoodsItemVO();
				vo.setItem_id(rs.getInt("item_id"));
				vo.setItem_name(rs.getString("item_name"));
				vo.setItem_price(rs.getInt("item_price"));
				vo.setItem_des(rs.getString("item_des"));
				vo.setItem_pic(rs.getString("item_pic"));
				return vo; //1row 반환
			} //mapRow end
		},item_id); //query end
	}//method end

	@Override
	public int itemInsert(GoodsItemVO vo)
	{
		String sql = "insert into goodsItem values(?,?,?,?,?)";
		return jdbcTemplate.update(sql, vo.getItem_id(), vo.getItem_name(), vo.getItem_price(), vo.getItem_des(), vo.getItem_pic());
	}

	@Override
	public int itemUpdate(GoodsItemVO vo)
	{
		String sql = "update goodsItem set item_name=?, item_price=?, item_des=? where item_id=?";
		return jdbcTemplate.update(sql,vo.getItem_name(),vo.getItem_price(), vo.getItem_des(), vo.getItem_id());
	}

	@Override
	public int itemDelete(GoodsItemVO vo)
	{
		String sql = "delete from goodsItem WHERE item_id =?";
		return jdbcTemplate.update(sql, vo.getItem_id());
	}
	
	
	
	
}// class end