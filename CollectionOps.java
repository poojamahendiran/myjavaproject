class CollectionOps {
    HashMap<String, ArrayList<Employee>> collections = new HashMap<>();

    void createCollection(String colName) {
        collections.put(colName, new ArrayList<>());
        System.out.println("Collection '" + colName + "' created.");
    }

    void addData(String colName) {
        ArrayList<Employee> data = new ArrayList<>();
        data.add(new Employee("E1", "John", "IT", "Male"));
        data.add(new Employee("E2", "Jane", "HR", "Female"));
        data.add(new Employee("E3", "Mark", "IT", "Male"));
        data.add(new Employee("E4", "Lucy", "Finance", "Female"));
        collections.get(colName).addAll(data);
    }

    void indexData(String colName, String excludeCol) {
        if (collections.containsKey(colName)) {
            for (Employee e : collections.get(colName)) {
                e.removeColumn(excludeCol);
            }
            System.out.println("Indexed '" + colName + "' excluding '" + excludeCol + "'");
        }
    }

    void searchByColumn(String colName, String col, String value) {
        if (collections.containsKey(colName)) {
            for (Employee e : collections.get(colName)) {
                if ((col.equalsIgnoreCase("department") && value.equals(e.dept)) ||
                    (col.equalsIgnoreCase("gender") && value.equals(e.gender))) {
                    System.out.println(e);
                }
            }
        }
    }

    void getEmpCount(String colName) {
        if (collections.containsKey(colName)) {
            System.out.println("Count in '" + colName + "': " + collections.get(colName).size());
        }
    }

    void delEmpById(String colName, String empId) {
        if (collections.containsKey(colName)) {
            collections.get(colName).removeIf(e -> e.empId.equals(empId));
            System.out.println("Deleted ID '" + empId + "' from '" + colName + "'");
        }
    }

    void getDepFacet(String colName) {
        HashMap<String, Integer> deptCount = new HashMap<>();
        if (collections.containsKey(colName)) {
            for (Employee e : collections.get(colName)) {
                if (e.dept != null) {
                    deptCount.put(e.dept, deptCount.getOrDefault(e.dept, 0) + 1);
                }
            }
            System.out.println("Department Facet in '" + colName + "': " + deptCount);
        }
    }
}
