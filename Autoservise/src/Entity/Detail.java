package Entity;
import java.util.List;

public class Detail extends EntityHasId {
    private String Name;
    private List<Attribute> attributes;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> carDetails) {
        this.attributes = carDetails;
    }
}
