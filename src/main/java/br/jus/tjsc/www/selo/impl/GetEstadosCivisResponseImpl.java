/*
 * XML Type:  getEstadosCivisResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEstadosCivisResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getEstadosCivisResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetEstadosCivisResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEstadosCivisResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetEstadosCivisResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESTADOSCIVIS$0 = 
        new javax.xml.namespace.QName("", "estadosCivis");
    
    
    /**
     * Gets array of all "estadosCivis" elements
     */
    public br.jus.tjsc.www.selo.EstadoCivil[] getEstadosCivisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ESTADOSCIVIS$0, targetList);
            br.jus.tjsc.www.selo.EstadoCivil[] result = new br.jus.tjsc.www.selo.EstadoCivil[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "estadosCivis" element
     */
    public br.jus.tjsc.www.selo.EstadoCivil getEstadosCivisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.EstadoCivil target = null;
            target = (br.jus.tjsc.www.selo.EstadoCivil)get_store().find_element_user(ESTADOSCIVIS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "estadosCivis" element
     */
    public int sizeOfEstadosCivisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTADOSCIVIS$0);
        }
    }
    
    /**
     * Sets array of all "estadosCivis" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEstadosCivisArray(br.jus.tjsc.www.selo.EstadoCivil[] estadosCivisArray)
    {
        check_orphaned();
        arraySetterHelper(estadosCivisArray, ESTADOSCIVIS$0);
    }
    
    /**
     * Sets ith "estadosCivis" element
     */
    public void setEstadosCivisArray(int i, br.jus.tjsc.www.selo.EstadoCivil estadosCivis)
    {
        generatedSetterHelperImpl(estadosCivis, ESTADOSCIVIS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "estadosCivis" element
     */
    public br.jus.tjsc.www.selo.EstadoCivil insertNewEstadosCivis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.EstadoCivil target = null;
            target = (br.jus.tjsc.www.selo.EstadoCivil)get_store().insert_element_user(ESTADOSCIVIS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "estadosCivis" element
     */
    public br.jus.tjsc.www.selo.EstadoCivil addNewEstadosCivis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.EstadoCivil target = null;
            target = (br.jus.tjsc.www.selo.EstadoCivil)get_store().add_element_user(ESTADOSCIVIS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "estadosCivis" element
     */
    public void removeEstadosCivis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTADOSCIVIS$0, i);
        }
    }
}
