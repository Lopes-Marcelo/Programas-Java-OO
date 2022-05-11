public class Livro implements Publicacao {
    
    //Atributos

    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Métodos Públicos

    public String detalhes(){
        return "Livro: " + " Título = " + titulo + "\n, Autor = " + autor + "\n, Total de Páginas = " + totPag + "\n, Página Atual = " + pagAtual + "\n, Aberto = " + aberto + "\n, Leitor = " + leitor.getNome() + " ";

    }

    //Métodos Especiais

    public Livro(String titulo, String autor, int totPag, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getTotPag(){
        return this.totPag;
    }

    public void setTotPag(int totPag){
        this.totPag = totPag;
    }
    
    public int getPagAtual(){
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }

    public boolean getAberto(){
        return this.aberto;
    }

    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }

    public Pessoa getLeitor(){
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }

    //Métodos Abstratos

    @Override
    public void abrir() {
        this.aberto = true; 
    }

    @Override
    public void fechar() {
        this.aberto = false;   
    }

    @Override
    public void folhear(int p) {
       this.pagAtual = p;   
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;  
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
