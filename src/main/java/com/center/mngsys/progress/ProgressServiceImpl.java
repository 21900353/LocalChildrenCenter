package com.center.mngsys.progress;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgressServiceImpl implements ProgressService {
	@Autowired
	ProgressDAO progressDAO;
	
	@Override
	public int insertProgress(ProgressVO vo) {
		return progressDAO.insertProgress(vo);
	}

	@Override
	public int updateProgress(ProgressVO vo) {
		return progressDAO.updateProgress(vo);
	}

	@Override
	public int deleteProgress(int sid) {
		return progressDAO.deleteProgress(sid);
	}

	@Override
	public ProgressVO getProgress(int sid) {
		return progressDAO.getProgress(sid);
	}

	@Override
	public List<ProgressVO> getProgressList() {
		return progressDAO.getProgressList();
	}
	
}
