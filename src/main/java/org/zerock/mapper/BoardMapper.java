package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper {

	// @Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();

	public void insert(BoardVO board);

	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	/*'몇 개의 데이터가 삭제,수정되었는가'를 처리할 수 있게 int 타입*/
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
	
}
