package com.port.persistence;

import java.util.List;

import com.port.domain.BoardVO;

public interface BoardDAO {
	public List<BoardVO> listAll() throws Exception;
}
