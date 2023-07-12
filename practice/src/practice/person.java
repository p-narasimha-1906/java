package practice;

public class person {
	private String name;
	private Integer age;
	private String job;
	
	person(String name,Integer age,String job)
	{
		this.name=name;
		this.age=age;
		this.job=job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
