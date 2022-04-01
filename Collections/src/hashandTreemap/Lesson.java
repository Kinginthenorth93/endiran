package hashandTreemap;

public class Lesson implements Comparable<Lesson> {
	private String SectionNo;
	private String ChapterNo;
	
	
	public Lesson(String sectionNo, String chapterNo) {
		super();
		SectionNo = sectionNo;
		ChapterNo = chapterNo;
	}


	public String getSectionNo() {
		return SectionNo;
	}


	public void setSectionNo(String sectionNo) {
		SectionNo = sectionNo;
	}


	public String getChapterNo() {
		return ChapterNo;
	}


	public void setChapterNo(String chapterNo) {
		ChapterNo = chapterNo;
	}


	@Override
	public String toString() {
		return "Lesson [SectionNo=" + SectionNo + ", ChapterNo=" + ChapterNo + "]";
	}


	@Override
	public int compareTo(Lesson o) {
	
		return 0;
	}
	
	
	
	
	
	
	
	
	
		

}
