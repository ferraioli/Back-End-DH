public class GradeDeFilmes implements IGradeDeFilmes{
    @Override
    public Filme getFilme(String nomeFilme) {
        Filme f = null;

        switch (nomeFilme) {
            case "The White Tiger":
                f = new Filme("The White Tiger", "Argentina");
                break;
            case "His House":
                f = new Filme("His House", "Brasil");
                break;
            case "Over the Moon":
                f = new Filme("Over the Moon", "Colombia");
                break;
            case "Superbad":
                f = new Filme("Superbad", "Argentina");
                break;
            case "The Babysitter":
                f = new Filme("The Babysitter", "Colombia");
                break;
        }

        return f;
    }
}
