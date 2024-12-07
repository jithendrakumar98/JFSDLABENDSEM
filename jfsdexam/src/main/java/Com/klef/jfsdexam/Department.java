package Com.klef.jfsdexam;

import javax.persistence.*;

@Entity
//@Table(name="jfsd")
public class Department {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "hod_name")
    private String hodName;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Department() {
	}

	public Department(Long departmentId, String name, String location, String hodName) {
		this.departmentId = departmentId;
		this.name = name;
		this.location = location;
		this.hodName = hodName;
	}

	public String getHodName() {
		return hodName;
	}

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}
    
}
