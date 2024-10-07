class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CollectionOps ops = new CollectionOps();

        System.out.println("Enter your name for collection:");
        String nameCol = "Hash_" + sc.nextLine();
        ops.createCollection(nameCol);
        ops.addData(nameCol);

        System.out.println("Enter last 4 digits of phone:");
        String phoneCol = "Hash_" + sc.nextLine();
        ops.createCollection(phoneCol);
        ops.addData(phoneCol);

        ops.getEmpCount(nameCol);

        ops.indexData(nameCol, "Department");
        ops.indexData(phoneCol, "Gender");

        ops.delEmpById(nameCol, "E3");

        ops.getEmpCount(nameCol);

        ops.searchByColumn(nameCol, "Department", "IT");
        ops.searchByColumn(nameCol, "Gender", "Male");
        ops.searchByColumn(phoneCol, "Department", "IT");

        ops.getDepFacet(nameCol);
        ops.getDepFacet(phoneCol);
    }
}
