/*
 * XML Type:  getEscolaridadesResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEscolaridadesResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getEscolaridadesResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetEscolaridadesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEscolaridadesResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetEscolaridadesResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESCOLARIDADES$0 = 
        new javax.xml.namespace.QName("", "escolaridades");
    
    
    /**
     * Gets array of all "escolaridades" elements
     */
    public br.jus.tjsc.www.selo.Escolaridade[] getEscolaridadesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ESCOLARIDADES$0, targetList);
            br.jus.tjsc.www.selo.Escolaridade[] result = new br.jus.tjsc.www.selo.Escolaridade[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "escolaridades" element
     */
    public br.jus.tjsc.www.selo.Escolaridade getEscolaridadesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Escolaridade target = null;
            target = (br.jus.tjsc.www.selo.Escolaridade)get_store().find_element_user(ESCOLARIDADES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "escolaridades" element
     */
    public int sizeOfEscolaridadesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESCOLARIDADES$0);
        }
    }
    
    /**
     * Sets array of all "escolaridades" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEscolaridadesArray(br.jus.tjsc.www.selo.Escolaridade[] escolaridadesArray)
    {
        check_orphaned();
        arraySetterHelper(escolaridadesArray, ESCOLARIDADES$0);
    }
    
    /**
     * Sets ith "escolaridades" element
     */
    public void setEscolaridadesArray(int i, br.jus.tjsc.www.selo.Escolaridade escolaridades)
    {
        generatedSetterHelperImpl(escolaridades, ESCOLARIDADES$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "escolaridades" element
     */
    public br.jus.tjsc.www.selo.Escolaridade insertNewEscolaridades(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Escolaridade target = null;
            target = (br.jus.tjsc.www.selo.Escolaridade)get_store().insert_element_user(ESCOLARIDADES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "escolaridades" element
     */
    public br.jus.tjsc.www.selo.Escolaridade addNewEscolaridades()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Escolaridade target = null;
            target = (br.jus.tjsc.www.selo.Escolaridade)get_store().add_element_user(ESCOLARIDADES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "escolaridades" element
     */
    public void removeEscolaridades(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESCOLARIDADES$0, i);
        }
    }
}
