package mayron.projeto12;

/**
 * Created by Jaciara on 26/11/2017.
 */

public class Sample2 {


        //IMagens, músicas ou mídias em geral, qdo colocadas o AndroidStudio
        //sao colocadas como
        private int imagemID, imagemID2;
        private String titulo, descricao;
        private boolean visibilidade = true;
        private Class activity;

        public int getImagemID() { return imagemID; }

        public int getImagemID2() {
        return imagemID2;
    }

        public String getTitulo() {
            return titulo;
        }

        public String getDescricao() {
            return descricao;
        }

        public Class getActivity() {
            return activity;
        }

        public boolean isVisibilidade() { return visibilidade; }

        public void setImagemID(int imagemID) {
            this.imagemID = imagemID;
        }

        public void setImagemID2(int imagemID2) {
        this.imagemID = imagemID2;
    }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public void setActivity(Class activity) {
            this.activity = activity;
        }

        public void setVisibilidade(boolean visibilidade) { this.visibilidade = visibilidade; }

        public Sample2(int imagemID, String titulo, String descricao) {
            this.imagemID = imagemID;
            this.titulo = titulo;
            this.descricao = descricao;
        }

        public Sample2(int imagemID, String titulo, String descricao, int imagemID2) {
            this.imagemID = imagemID;
            this.titulo = titulo;
            this.descricao = descricao;
            this.imagemID2 = imagemID2;
            this.visibilidade = visibilidade;
        }

        public Sample2(int imagemID, String titulo, String descricao, boolean visibilidade, Class<?> seg_activity) {
            this.imagemID = imagemID;
            this.titulo = titulo;
            this.descricao = descricao;
            this.visibilidade = visibilidade;
            this.activity = seg_activity;
        }


}
