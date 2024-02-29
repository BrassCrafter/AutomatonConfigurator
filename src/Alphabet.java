public class Language {
    char[] language;
    public Language(char[] language){
        this.language = language;
    }
    public char[] getLanguage(){
        return language;
    }
    public c

    public static void main(String[] args) {
        char[] langArr = new char[]{'a', 'b', 'c'};
        Language language = new Language(langArr);
        for(int i = 0; i < language.getLanguage().length; i++)
            System.out.println(language.getLanguage()[i]);
    }
}
