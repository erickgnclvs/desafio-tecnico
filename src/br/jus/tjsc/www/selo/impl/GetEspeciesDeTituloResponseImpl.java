/*
 * XML Type:  getEspeciesDeTituloResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEspeciesDeTituloResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getEspeciesDeTituloResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetEspeciesDeTituloResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEspeciesDeTituloResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetEspeciesDeTituloResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESPECIESDETITULO$0 = 
        new javax.xml.namespace.QName("", "especiesDeTitulo");
    
    
    /**
     * Gets array of all "especiesDeTitulo" elements
     */
    public br.jus.tjsc.www.selo.EspecieTitulo[] getEspeciesDeTituloArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ESPECIESDETITULO$0, targetList);
            br.jus.tjsc.www.selo.EspecieTitulo[] result = new br.jus.tjsc.www.selo.EspecieTitulo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "especiesDeTitulo" element
     */
    public br.jus.tjsc.www.selo.EspecieTitulo getEspeciesDeTituloArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.EspecieTitulo target = null;
            target = (br.jus.tjsc.www.selo.EspecieTitulo)get_store().find_element_user(ESPECIESDETITULO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "especiesDeTitulo" element
     */
    public int sizeOfEspeciesDeTituloArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESPECIESDETITULO$0);
        }
    }
    
    /**
     * Sets array of all "especiesDeTitulo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEspeciesDeTituloArray(br.jus.tjsc.www.selo.EspecieTitulo[] especiesDeTituloArray)
    {
        check_orphaned();
        arraySetterHelper(especiesDeTituloArray, ESPECIESDETITULO$0);
    }
    
    /**
     * Sets ith "especiesDeTitulo" element
     */
    public void setEspeciesDeTituloArray(int i, br.jus.tjsc.www.selo.EspecieTitulo especiesDeTitulo)
    {
        generatedSetterHelperImpl(especiesDeTitulo, ESPECIESDETITULO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "especiesDeTitulo" element
     */
    public br.jus.tjsc.www.selo.EspecieTitulo insertNewEspeciesDeTitulo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.EspecieTitulo target = null;
            target = (br.jus.tjsc.www.selo.EspecieTitulo)get_store().insert_element_user(ESPECIESDETITULO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "especiesDeTitulo" element
     */
    public br.jus.tjsc.www.selo.EspecieTitulo addNewEspeciesDeTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.EspecieTitulo target = null;
            target = (br.jus.tjsc.www.selo.EspecieTitulo)get_store().add_element_user(ESPECIESDETITULO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "especiesDeTitulo" element
     */
    public void removeEspeciesDeTitulo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESPECIESDETITULO$0, i);
        }
    }
}
