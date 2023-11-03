/*
 * XML Type:  getBancosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetBancosResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getBancosResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetBancosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetBancosResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetBancosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BANCOS$0 = 
        new javax.xml.namespace.QName("", "bancos");
    
    
    /**
     * Gets array of all "bancos" elements
     */
    public br.jus.tjsc.www.selo.Banco[] getBancosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BANCOS$0, targetList);
            br.jus.tjsc.www.selo.Banco[] result = new br.jus.tjsc.www.selo.Banco[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bancos" element
     */
    public br.jus.tjsc.www.selo.Banco getBancosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Banco target = null;
            target = (br.jus.tjsc.www.selo.Banco)get_store().find_element_user(BANCOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bancos" element
     */
    public int sizeOfBancosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BANCOS$0);
        }
    }
    
    /**
     * Sets array of all "bancos" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBancosArray(br.jus.tjsc.www.selo.Banco[] bancosArray)
    {
        check_orphaned();
        arraySetterHelper(bancosArray, BANCOS$0);
    }
    
    /**
     * Sets ith "bancos" element
     */
    public void setBancosArray(int i, br.jus.tjsc.www.selo.Banco bancos)
    {
        generatedSetterHelperImpl(bancos, BANCOS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bancos" element
     */
    public br.jus.tjsc.www.selo.Banco insertNewBancos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Banco target = null;
            target = (br.jus.tjsc.www.selo.Banco)get_store().insert_element_user(BANCOS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bancos" element
     */
    public br.jus.tjsc.www.selo.Banco addNewBancos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Banco target = null;
            target = (br.jus.tjsc.www.selo.Banco)get_store().add_element_user(BANCOS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "bancos" element
     */
    public void removeBancos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BANCOS$0, i);
        }
    }
}
