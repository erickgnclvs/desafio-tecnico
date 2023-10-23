/*
 * XML Type:  getTiposDeSeloResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeSeloResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeSeloResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeSeloResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeSeloResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeSeloResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDESELO$0 = 
        new javax.xml.namespace.QName("", "tiposDeSelo");
    
    
    /**
     * Gets array of all "tiposDeSelo" elements
     */
    public br.jus.tjsc.www.selo.TipoSelo[] getTiposDeSeloArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDESELO$0, targetList);
            br.jus.tjsc.www.selo.TipoSelo[] result = new br.jus.tjsc.www.selo.TipoSelo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeSelo" element
     */
    public br.jus.tjsc.www.selo.TipoSelo getTiposDeSeloArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoSelo target = null;
            target = (br.jus.tjsc.www.selo.TipoSelo)get_store().find_element_user(TIPOSDESELO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeSelo" element
     */
    public int sizeOfTiposDeSeloArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDESELO$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeSelo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeSeloArray(br.jus.tjsc.www.selo.TipoSelo[] tiposDeSeloArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeSeloArray, TIPOSDESELO$0);
    }
    
    /**
     * Sets ith "tiposDeSelo" element
     */
    public void setTiposDeSeloArray(int i, br.jus.tjsc.www.selo.TipoSelo tiposDeSelo)
    {
        generatedSetterHelperImpl(tiposDeSelo, TIPOSDESELO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeSelo" element
     */
    public br.jus.tjsc.www.selo.TipoSelo insertNewTiposDeSelo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoSelo target = null;
            target = (br.jus.tjsc.www.selo.TipoSelo)get_store().insert_element_user(TIPOSDESELO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeSelo" element
     */
    public br.jus.tjsc.www.selo.TipoSelo addNewTiposDeSelo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoSelo target = null;
            target = (br.jus.tjsc.www.selo.TipoSelo)get_store().add_element_user(TIPOSDESELO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeSelo" element
     */
    public void removeTiposDeSelo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDESELO$0, i);
        }
    }
}
