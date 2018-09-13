class main {
        public static void main(String[] args) {
            AbstConn conn1 = new ConcretConn();
            conn1.initialize("192.xx.xx.xx", 2018);
            conn1.sendMessage("Hello WOrld!"); 
            System.out.println("========================");
            AbstConn conn2 = new Concret2Conn();
            conn2.initialize("192.xx.xx.xx", 2018);
            conn2.sendMessage("Hello WOrld!"); 
        }
}