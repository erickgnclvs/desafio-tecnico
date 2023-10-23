/*
 * XML Type:  getTiposDeAto20Response
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeAto20Response
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeAto20Response(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeAto20ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeAto20Response
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeAto20ResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDEATO20$0 = 
        new javax.xml.namespace.QName("", "tiposDeAto20");
    
    
    /**
     * Gets array of all "tiposDeAto20" elements
     */
    public br.jus.tjsc.www.selo.TipoAto20[] getTiposDeAto20Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDEATO20$0, targetList);
            br.jus.tjsc.www.selo.TipoAto20[] result = new br.jus.tjsc.www.selo.TipoAto20[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeAto20" element
     */
    public br.jus.tjsc.www.selo.TipoAto20 getTiposDeAto20Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoAto20 target = null;
            target = (br.jus.tjsc.www.selo.TipoAto20)get_store().find_element_user(TIPOSDEATO20$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeAto20" element
     */
    public int sizeOfTiposDeAto20Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDEATO20$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeAto20" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeAto20Array(br.jus.tjsc.www.selo.TipoAto20[] tiposDeAto20Array)
    {
        check_orphaned();
        arraySetterHelper(tiposDeAto20Array, TIPOSDEATO20$0);
    }
    
    /**
     * Sets ith "tiposDeAto20" element
     */
    public void setTiposDeAto20Array(int i, br.jus.tjsc.www.selo.TipoAto20 tiposDeAto20)
    {
        generatedSetterHelperImpl(tiposDeAto20, TIPOSDEATO20$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeAto20" element
     */
    public br.jus.tjsc.www.selo.TipoAto20 insertNewTiposDeAto20(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoAto20 target = null;
            target = (br.jus.tjsc.www.selo.TipoAto20)get_store().insert_element_user(TIPOSDEATO20$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeAto20" element
     */
    public br.jus.tjsc.www.selo.TipoAto20 addNewTiposDeAto20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoAto20 target = null;
            target = (br.jus.tjsc.www.selo.TipoAto20)get_store().add_element_user(TIPOSDEATO20$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeAto20" element
     */
    public void removeTiposDeAto20(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDEATO20$0, i);
        }
    }
}
