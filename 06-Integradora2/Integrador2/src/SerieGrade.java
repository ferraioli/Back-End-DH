public class SerieGrade implements Iserie{
    @Override
    public Serie getSerie(String nomeSerie) {
        Serie s = null;

        switch (nomeSerie) {
            case "The White Tiger":
                s = new Serie("The White Tiger", "Argentina");
                break;
            case "His House":
                s = new Serie("His House", "Brasil" );
                break;
            case "Over the Moon":
                s = new Serie("Over the Moon", "Colombia");
                break;
            case "Superbad":
                s = new Serie("Superbad", "Argentina");
                break;
            case "The Babysitter":
                s = new Serie("The Babysitter", "Colombia");
                break;
        }

        return s;
    }
}
