/*
 * XML Type:  getTiposDeEmailResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeEmailResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeEmailResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeEmailResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeEmailResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeEmailResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDEEMAIL$0 = 
        new javax.xml.namespace.QName("", "tiposDeEmail");
    
    
    /**
     * Gets array of all "tiposDeEmail" elements
     */
    public br.jus.tjsc.www.selo.TipoEmail[] getTiposDeEmailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDEEMAIL$0, targetList);
            br.jus.tjsc.www.selo.TipoEmail[] result = new br.jus.tjsc.www.selo.TipoEmail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeEmail" element
     */
    public br.jus.tjsc.www.selo.TipoEmail getTiposDeEmailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoEmail target = null;
            target = (br.jus.tjsc.www.selo.TipoEmail)get_store().find_element_user(TIPOSDEEMAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeEmail" element
     */
    public int sizeOfTiposDeEmailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDEEMAIL$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeEmail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeEmailArray(br.jus.tjsc.www.selo.TipoEmail[] tiposDeEmailArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeEmailArray, TIPOSDEEMAIL$0);
    }
    
    /**
     * Sets ith "tiposDeEmail" element
     */
    public void setTiposDeEmailArray(int i, br.jus.tjsc.www.selo.TipoEmail tiposDeEmail)
    {
        generatedSetterHelperImpl(tiposDeEmail, TIPOSDEEMAIL$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeEmail" element
     */
    public br.jus.tjsc.www.selo.TipoEmail insertNewTiposDeEmail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoEmail target = null;
            target = (br.jus.tjsc.www.selo.TipoEmail)get_store().insert_element_user(TIPOSDEEMAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeEmail" element
     */
    public br.jus.tjsc.www.selo.TipoEmail addNewTiposDeEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoEmail target = null;
            target = (br.jus.tjsc.www.selo.TipoEmail)get_store().add_element_user(TIPOSDEEMAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeEmail" element
     */
    public void removeTiposDeEmail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDEEMAIL$0, i);
        }
    }
}
