package com.center.mngsys.progress;

import java.util.List;

public interface ProgressService {
	public int insertProgress(ProgressVO vo);
	public int updateProgress(ProgressVO vo);
	public int deleteProgress(int sid);
	public ProgressVO getProgress(int sid);
	public List<ProgressVO> getProgressList();
}
