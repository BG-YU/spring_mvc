package com.port.service;

import java.util.List;

import com.port.domain.BoardVO;

public interface BoardService {
	public List<BoardVO> listAll() throws Exception;
}
