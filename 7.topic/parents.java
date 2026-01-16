public class parents {
}

class child extends parents {
}

class testinstanceof {
    public static void main(String[] args) {
        parents p = new child();   // FIXED: parent → parents

        if (p instanceof child)
            System.out.println("p is child obj");
        else
            System.out.println("not child");
    }
}
