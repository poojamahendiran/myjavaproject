class Employee {
    String empId, name, dept, gender;

    Employee(String empId, String name, String dept, String gender) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.gender = gender;
    }

    void removeColumn(String col) {
        if (col.equalsIgnoreCase("department")) this.dept = null;
        if (col.equalsIgnoreCase("gender")) this.gender = null;
    }

    @Override
    public String toString() {
        return "ID: " + empId + ", Name: " + name + (dept != null ? ", Dept: " + dept : "") + (gender != null ? ", Gender: " + gender : "");
    }
}
