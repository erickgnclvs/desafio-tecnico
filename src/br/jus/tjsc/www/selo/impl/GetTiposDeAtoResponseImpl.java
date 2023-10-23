/*
 * XML Type:  getTiposDeAtoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeAtoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeAtoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeAtoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeAtoResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeAtoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDEATO$0 = 
        new javax.xml.namespace.QName("", "tiposDeAto");
    
    
    /**
     * Gets array of all "tiposDeAto" elements
     */
    public br.jus.tjsc.www.selo.TipoAto[] getTiposDeAtoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDEATO$0, targetList);
            br.jus.tjsc.www.selo.TipoAto[] result = new br.jus.tjsc.www.selo.TipoAto[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeAto" element
     */
    public br.jus.tjsc.www.selo.TipoAto getTiposDeAtoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoAto target = null;
            target = (br.jus.tjsc.www.selo.TipoAto)get_store().find_element_user(TIPOSDEATO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeAto" element
     */
    public int sizeOfTiposDeAtoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDEATO$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeAto" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeAtoArray(br.jus.tjsc.www.selo.TipoAto[] tiposDeAtoArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeAtoArray, TIPOSDEATO$0);
    }
    
    /**
     * Sets ith "tiposDeAto" element
     */
    public void setTiposDeAtoArray(int i, br.jus.tjsc.www.selo.TipoAto tiposDeAto)
    {
        generatedSetterHelperImpl(tiposDeAto, TIPOSDEATO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeAto" element
     */
    public br.jus.tjsc.www.selo.TipoAto insertNewTiposDeAto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoAto target = null;
            target = (br.jus.tjsc.www.selo.TipoAto)get_store().insert_element_user(TIPOSDEATO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeAto" element
     */
    public br.jus.tjsc.www.selo.TipoAto addNewTiposDeAto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoAto target = null;
            target = (br.jus.tjsc.www.selo.TipoAto)get_store().add_element_user(TIPOSDEATO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeAto" element
     */
    public void removeTiposDeAto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDEATO$0, i);
        }
    }
}
