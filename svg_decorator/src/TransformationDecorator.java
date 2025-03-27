import java.util.Locale;

public class TransformationDecorator  extends ShapeDecorator{
    private String transform;

    @Override
    public String toSvg(String iputSvg){
        return super.toSvg(String.format("transform=""))
    }
    public TransformationDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    public static class Builder{
        private String transform = "";
        public Builder translate(Vec2 translation) {
            this.transform += String.format(Locale.ENGLISH,
                    "translate(%f %f)",
                    translation.x())

        }
    }

}
