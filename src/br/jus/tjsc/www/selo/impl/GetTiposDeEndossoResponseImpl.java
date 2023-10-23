/*
 * XML Type:  getTiposDeEndossoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeEndossoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeEndossoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeEndossoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeEndossoResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeEndossoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDEENDOSSO$0 = 
        new javax.xml.namespace.QName("", "tiposDeEndosso");
    
    
    /**
     * Gets array of all "tiposDeEndosso" elements
     */
    public br.jus.tjsc.www.selo.TipoEndosso[] getTiposDeEndossoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDEENDOSSO$0, targetList);
            br.jus.tjsc.www.selo.TipoEndosso[] result = new br.jus.tjsc.www.selo.TipoEndosso[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeEndosso" element
     */
    public br.jus.tjsc.www.selo.TipoEndosso getTiposDeEndossoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoEndosso target = null;
            target = (br.jus.tjsc.www.selo.TipoEndosso)get_store().find_element_user(TIPOSDEENDOSSO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeEndosso" element
     */
    public int sizeOfTiposDeEndossoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDEENDOSSO$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeEndosso" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeEndossoArray(br.jus.tjsc.www.selo.TipoEndosso[] tiposDeEndossoArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeEndossoArray, TIPOSDEENDOSSO$0);
    }
    
    /**
     * Sets ith "tiposDeEndosso" element
     */
    public void setTiposDeEndossoArray(int i, br.jus.tjsc.www.selo.TipoEndosso tiposDeEndosso)
    {
        generatedSetterHelperImpl(tiposDeEndosso, TIPOSDEENDOSSO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeEndosso" element
     */
    public br.jus.tjsc.www.selo.TipoEndosso insertNewTiposDeEndosso(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoEndosso target = null;
            target = (br.jus.tjsc.www.selo.TipoEndosso)get_store().insert_element_user(TIPOSDEENDOSSO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeEndosso" element
     */
    public br.jus.tjsc.www.selo.TipoEndosso addNewTiposDeEndosso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoEndosso target = null;
            target = (br.jus.tjsc.www.selo.TipoEndosso)get_store().add_element_user(TIPOSDEENDOSSO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeEndosso" element
     */
    public void removeTiposDeEndosso(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDEENDOSSO$0, i);
        }
    }
}
