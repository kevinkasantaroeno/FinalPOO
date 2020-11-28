class Externa{
    void metodoExterno(){
        class Interna{
            void metodoInterno(){
                System.out.println("Chamada do metodo interno");
            }
        }
        Interna obj = new Interna();
        obj.metodoInterno();
    }
}