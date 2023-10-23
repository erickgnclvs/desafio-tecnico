/*
 * XML Type:  getMotivosDeProtestoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetMotivosDeProtestoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getMotivosDeProtestoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetMotivosDeProtestoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetMotivosDeProtestoResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetMotivosDeProtestoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOTIVOSDEPROTESTO$0 = 
        new javax.xml.namespace.QName("", "motivosDeProtesto");
    
    
    /**
     * Gets array of all "motivosDeProtesto" elements
     */
    public br.jus.tjsc.www.selo.MotivoProtesto[] getMotivosDeProtestoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOTIVOSDEPROTESTO$0, targetList);
            br.jus.tjsc.www.selo.MotivoProtesto[] result = new br.jus.tjsc.www.selo.MotivoProtesto[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "motivosDeProtesto" element
     */
    public br.jus.tjsc.www.selo.MotivoProtesto getMotivosDeProtestoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.MotivoProtesto target = null;
            target = (br.jus.tjsc.www.selo.MotivoProtesto)get_store().find_element_user(MOTIVOSDEPROTESTO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "motivosDeProtesto" element
     */
    public int sizeOfMotivosDeProtestoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOTIVOSDEPROTESTO$0);
        }
    }
    
    /**
     * Sets array of all "motivosDeProtesto" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMotivosDeProtestoArray(br.jus.tjsc.www.selo.MotivoProtesto[] motivosDeProtestoArray)
    {
        check_orphaned();
        arraySetterHelper(motivosDeProtestoArray, MOTIVOSDEPROTESTO$0);
    }
    
    /**
     * Sets ith "motivosDeProtesto" element
     */
    public void setMotivosDeProtestoArray(int i, br.jus.tjsc.www.selo.MotivoProtesto motivosDeProtesto)
    {
        generatedSetterHelperImpl(motivosDeProtesto, MOTIVOSDEPROTESTO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "motivosDeProtesto" element
     */
    public br.jus.tjsc.www.selo.MotivoProtesto insertNewMotivosDeProtesto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.MotivoProtesto target = null;
            target = (br.jus.tjsc.www.selo.MotivoProtesto)get_store().insert_element_user(MOTIVOSDEPROTESTO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "motivosDeProtesto" element
     */
    public br.jus.tjsc.www.selo.MotivoProtesto addNewMotivosDeProtesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.MotivoProtesto target = null;
            target = (br.jus.tjsc.www.selo.MotivoProtesto)get_store().add_element_user(MOTIVOSDEPROTESTO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "motivosDeProtesto" element
     */
    public void removeMotivosDeProtesto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOTIVOSDEPROTESTO$0, i);
        }
    }
}
