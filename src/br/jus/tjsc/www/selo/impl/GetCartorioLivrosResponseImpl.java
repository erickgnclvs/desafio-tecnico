/*
 * XML Type:  getCartorioLivrosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartorioLivrosResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getCartorioLivrosResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetCartorioLivrosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartorioLivrosResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetCartorioLivrosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTORIOLIVROS$0 = 
        new javax.xml.namespace.QName("", "cartorioLivros");
    
    
    /**
     * Gets array of all "cartorioLivros" elements
     */
    public br.jus.tjsc.www.selo.CartorioLivro[] getCartorioLivrosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CARTORIOLIVROS$0, targetList);
            br.jus.tjsc.www.selo.CartorioLivro[] result = new br.jus.tjsc.www.selo.CartorioLivro[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cartorioLivros" element
     */
    public br.jus.tjsc.www.selo.CartorioLivro getCartorioLivrosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.CartorioLivro target = null;
            target = (br.jus.tjsc.www.selo.CartorioLivro)get_store().find_element_user(CARTORIOLIVROS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cartorioLivros" element
     */
    public int sizeOfCartorioLivrosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARTORIOLIVROS$0);
        }
    }
    
    /**
     * Sets array of all "cartorioLivros" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCartorioLivrosArray(br.jus.tjsc.www.selo.CartorioLivro[] cartorioLivrosArray)
    {
        check_orphaned();
        arraySetterHelper(cartorioLivrosArray, CARTORIOLIVROS$0);
    }
    
    /**
     * Sets ith "cartorioLivros" element
     */
    public void setCartorioLivrosArray(int i, br.jus.tjsc.www.selo.CartorioLivro cartorioLivros)
    {
        generatedSetterHelperImpl(cartorioLivros, CARTORIOLIVROS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cartorioLivros" element
     */
    public br.jus.tjsc.www.selo.CartorioLivro insertNewCartorioLivros(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.CartorioLivro target = null;
            target = (br.jus.tjsc.www.selo.CartorioLivro)get_store().insert_element_user(CARTORIOLIVROS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cartorioLivros" element
     */
    public br.jus.tjsc.www.selo.CartorioLivro addNewCartorioLivros()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.CartorioLivro target = null;
            target = (br.jus.tjsc.www.selo.CartorioLivro)get_store().add_element_user(CARTORIOLIVROS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cartorioLivros" element
     */
    public void removeCartorioLivros(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARTORIOLIVROS$0, i);
        }
    }
}
