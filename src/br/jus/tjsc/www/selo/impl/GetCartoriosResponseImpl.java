/*
 * XML Type:  getCartoriosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartoriosResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getCartoriosResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetCartoriosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartoriosResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetCartoriosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTORIOS$0 = 
        new javax.xml.namespace.QName("", "cartorios");
    
    
    /**
     * Gets array of all "cartorios" elements
     */
    public br.jus.tjsc.www.selo.Cartorio[] getCartoriosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CARTORIOS$0, targetList);
            br.jus.tjsc.www.selo.Cartorio[] result = new br.jus.tjsc.www.selo.Cartorio[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cartorios" element
     */
    public br.jus.tjsc.www.selo.Cartorio getCartoriosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Cartorio target = null;
            target = (br.jus.tjsc.www.selo.Cartorio)get_store().find_element_user(CARTORIOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cartorios" element
     */
    public int sizeOfCartoriosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARTORIOS$0);
        }
    }
    
    /**
     * Sets array of all "cartorios" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCartoriosArray(br.jus.tjsc.www.selo.Cartorio[] cartoriosArray)
    {
        check_orphaned();
        arraySetterHelper(cartoriosArray, CARTORIOS$0);
    }
    
    /**
     * Sets ith "cartorios" element
     */
    public void setCartoriosArray(int i, br.jus.tjsc.www.selo.Cartorio cartorios)
    {
        generatedSetterHelperImpl(cartorios, CARTORIOS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cartorios" element
     */
    public br.jus.tjsc.www.selo.Cartorio insertNewCartorios(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Cartorio target = null;
            target = (br.jus.tjsc.www.selo.Cartorio)get_store().insert_element_user(CARTORIOS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cartorios" element
     */
    public br.jus.tjsc.www.selo.Cartorio addNewCartorios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Cartorio target = null;
            target = (br.jus.tjsc.www.selo.Cartorio)get_store().add_element_user(CARTORIOS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cartorios" element
     */
    public void removeCartorios(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARTORIOS$0, i);
        }
    }
}
