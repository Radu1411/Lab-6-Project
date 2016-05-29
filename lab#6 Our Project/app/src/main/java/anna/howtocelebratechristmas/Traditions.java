package anna.howtocelebratechristmas;

public enum Traditions {
    Choice_6(R.string.Tradition_Choice_6),
    Choice_1(R.string.Tradition_Choice_1),
    Choice_3(R.string.Tradition_Choice_3),
    Choice_4(R.string.Tradition_Choice_4),
    Choice_7(R.string.Tradition_Choice_7),
    ;

    public int titleResId;

    Traditions(int titleResId) {
        this.titleResId = titleResId;
    }

}
