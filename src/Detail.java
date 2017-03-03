
public class Detail {
    private String id;
    private String loc_code;
    private String emp_dept;
    private String emp_team;
    private String emp_shift;
    private String emp_id;
    private String emp_name;
    private String clock_in;
    private String clock_out;
    private String emp_call_cd;
    private String emp_sch_cd;
    boolean[] values;
    

    public Detail(String id,String loc_code,String emp_dept,String emp_team,String emp_shift,String emp_id,String emp_name,String clock_in, String clock_out,String emp_call_cd,String emp_sch_cd )
    {
        this.id = id;
        this.loc_code=loc_code;
        this.emp_dept = emp_dept;
         this.emp_team = emp_team;
         this.emp_shift = emp_shift;
         this.emp_id = emp_id;
         this.emp_name = emp_name;
         this.clock_in = clock_in;
         this.clock_out = clock_out;
         this.emp_call_cd = emp_call_cd;
         this.emp_sch_cd = emp_sch_cd;
         
    }

   
public String getId() {
    return id;
}


public void setId(String id) {
    this.id = id;
}
public String getemp_name() {
    return emp_name;
}


public void setemp_name(String emp_name) {
    this.emp_name = emp_name;
}

public void setloc_code(String loc_code) {
    this.loc_code = loc_code;
}

/**
 * @return the name
 */
public String getloc_code() {
    return loc_code;
}

/**
 * @return the age
 */
public String getemp_dept() {
    return emp_dept;
}
public void setemp_dept(String emp_dept) {
    this.emp_dept = emp_dept;
}
public String getemp_team() {
    return emp_team;
}
public void setemp_team(String emp_team) {
    this.emp_team = emp_team;
}



public String getemp_shift() {
    return emp_shift;
}
public void setemp_shift(String emp_shift) {
    this.emp_shift = emp_shift;
}
public String getemp_id() {
    return emp_id;
}
public void setemp_id(String emp_id) {
    this.emp_id = emp_id;
}
public String getclock_in() {
    return clock_in;
}
public void setclock_in(String clock_in) {
    this.clock_in = clock_in;
}
public String getclock_out() {
    return clock_out;
}
public void setclock_out(String clock_out) {
    this.clock_out = clock_out;
}
public String getemp_call_cd() {
    return emp_call_cd;
}
public void setemp_call_cd(String emp_call_cd) {
    this.emp_call_cd = emp_call_cd;
}
public String getemp_sch_cd() {
    return emp_sch_cd;
}
public void setemp_sch_cd(String emp_sch_cd) {
    this.emp_sch_cd = emp_sch_cd;
}
public String toString(){
    return this.id + " " + this.loc_code + " " + this.emp_dept + " " + this.emp_team + " " + this.emp_shift + " " + this.emp_id + " " + this.emp_name + " " + this.clock_in + " " + this.clock_out + " " + this.emp_call_cd+ " "+emp_sch_cd;
}

    
}
