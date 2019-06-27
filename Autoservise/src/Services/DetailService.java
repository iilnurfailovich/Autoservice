package Services;

import Entity.Detail;

import java.util.List;

public class DetailService implements ICrudService<Detail> {

    @Override
    public void Create(Detail entity) {
        String sql = "Insert into detail (id, name, attributes) values (null, " + Detail.class.getName() + ")";
    }

    @Override
    public void Update(Detail entity) {

    }

    @Override
    public void Delete(long id) {
        String sql = "Delete from detail where id = " + id;
    }

    @Override
    public Detail Select(long id) {
        String sql = "Select from detail where id = " + id;
        return null;
    }

    @Override
    public List<Detail> SelectAll() {

        String sql = "Select * from detail";


        return null;
    }
}
