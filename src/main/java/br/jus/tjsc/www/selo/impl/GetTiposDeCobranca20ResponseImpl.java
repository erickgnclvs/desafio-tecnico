/*
 * XML Type:  getTiposDeCobranca20Response
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeCobranca20Response
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeCobranca20Response(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeCobranca20ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeCobranca20Response
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeCobranca20ResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDECOBRANCA20$0 = 
        new javax.xml.namespace.QName("", "tiposDeCobranca20");
    
    
    /**
     * Gets array of all "tiposDeCobranca20" elements
     */
    public br.jus.tjsc.www.selo.TipoCobranca20[] getTiposDeCobranca20Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDECOBRANCA20$0, targetList);
            br.jus.tjsc.www.selo.TipoCobranca20[] result = new br.jus.tjsc.www.selo.TipoCobranca20[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeCobranca20" element
     */
    public br.jus.tjsc.www.selo.TipoCobranca20 getTiposDeCobranca20Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoCobranca20 target = null;
            target = (br.jus.tjsc.www.selo.TipoCobranca20)get_store().find_element_user(TIPOSDECOBRANCA20$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeCobranca20" element
     */
    public int sizeOfTiposDeCobranca20Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDECOBRANCA20$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeCobranca20" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeCobranca20Array(br.jus.tjsc.www.selo.TipoCobranca20[] tiposDeCobranca20Array)
    {
        check_orphaned();
        arraySetterHelper(tiposDeCobranca20Array, TIPOSDECOBRANCA20$0);
    }
    
    /**
     * Sets ith "tiposDeCobranca20" element
     */
    public void setTiposDeCobranca20Array(int i, br.jus.tjsc.www.selo.TipoCobranca20 tiposDeCobranca20)
    {
        generatedSetterHelperImpl(tiposDeCobranca20, TIPOSDECOBRANCA20$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeCobranca20" element
     */
    public br.jus.tjsc.www.selo.TipoCobranca20 insertNewTiposDeCobranca20(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoCobranca20 target = null;
            target = (br.jus.tjsc.www.selo.TipoCobranca20)get_store().insert_element_user(TIPOSDECOBRANCA20$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeCobranca20" element
     */
    public br.jus.tjsc.www.selo.TipoCobranca20 addNewTiposDeCobranca20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoCobranca20 target = null;
            target = (br.jus.tjsc.www.selo.TipoCobranca20)get_store().add_element_user(TIPOSDECOBRANCA20$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeCobranca20" element
     */
    public void removeTiposDeCobranca20(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDECOBRANCA20$0, i);
        }
    }
}
