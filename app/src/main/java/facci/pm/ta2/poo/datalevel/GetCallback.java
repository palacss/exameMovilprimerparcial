package facci.pm.ta2.poo.datalevel;

/**
 * Created by Salva on 09/02/2016.
 */
public interface GetCallback<DataObject> {
    public void done(DataObject object, DataException e);
}
