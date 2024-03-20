package shub.Model;

public class Class {
	private int classId;
    private String className;
    private String classDescription;
    private String classSchedule;
    private Trainer trainer;
	
	// Generate Constructor using Fields
	
    /**
	 * @param classId
	 * @param className
	 * @param classDescription
	 * @param classSchedule
	 * @param trainer
	 */
	public Class(int classId, String className, String classDescription, String classSchedule, Trainer trainer) {
		super();
		this.classId = classId;
		this.className = className;
		this.classDescription = classDescription;
		this.classSchedule = classSchedule;
		this.trainer = trainer;
	}
	
	// Generate Constructors from Superclass
	
	/**
	 * 
	 */
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}	

    public Class(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	// Getter methods
    public int getClassId() {
        return classId;
    }

    public String getClassName() {
        return className;
    }

    public String getClassDescription() {
        return classDescription;
    }

    public String getClassSchedule() {
        return classSchedule;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    // Setter methods
    public void setClassId(int classId) {
        this.classId = classId;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setClassDescription(String classDescription) {
        this.classDescription = classDescription;
    }

    public void setClassSchedule(String classSchedule) {
        this.classSchedule = classSchedule;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
