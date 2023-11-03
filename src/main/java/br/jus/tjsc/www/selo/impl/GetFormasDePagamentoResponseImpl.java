/*
 * XML Type:  getFormasDePagamentoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetFormasDePagamentoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getFormasDePagamentoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetFormasDePagamentoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetFormasDePagamentoResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetFormasDePagamentoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMASDEPAGAMENTO$0 = 
        new javax.xml.namespace.QName("", "formasDePagamento");
    
    
    /**
     * Gets array of all "formasDePagamento" elements
     */
    public br.jus.tjsc.www.selo.FormaPagamento[] getFormasDePagamentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMASDEPAGAMENTO$0, targetList);
            br.jus.tjsc.www.selo.FormaPagamento[] result = new br.jus.tjsc.www.selo.FormaPagamento[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "formasDePagamento" element
     */
    public br.jus.tjsc.www.selo.FormaPagamento getFormasDePagamentoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.FormaPagamento target = null;
            target = (br.jus.tjsc.www.selo.FormaPagamento)get_store().find_element_user(FORMASDEPAGAMENTO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "formasDePagamento" element
     */
    public int sizeOfFormasDePagamentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMASDEPAGAMENTO$0);
        }
    }
    
    /**
     * Sets array of all "formasDePagamento" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFormasDePagamentoArray(br.jus.tjsc.www.selo.FormaPagamento[] formasDePagamentoArray)
    {
        check_orphaned();
        arraySetterHelper(formasDePagamentoArray, FORMASDEPAGAMENTO$0);
    }
    
    /**
     * Sets ith "formasDePagamento" element
     */
    public void setFormasDePagamentoArray(int i, br.jus.tjsc.www.selo.FormaPagamento formasDePagamento)
    {
        generatedSetterHelperImpl(formasDePagamento, FORMASDEPAGAMENTO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "formasDePagamento" element
     */
    public br.jus.tjsc.www.selo.FormaPagamento insertNewFormasDePagamento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.FormaPagamento target = null;
            target = (br.jus.tjsc.www.selo.FormaPagamento)get_store().insert_element_user(FORMASDEPAGAMENTO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "formasDePagamento" element
     */
    public br.jus.tjsc.www.selo.FormaPagamento addNewFormasDePagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.FormaPagamento target = null;
            target = (br.jus.tjsc.www.selo.FormaPagamento)get_store().add_element_user(FORMASDEPAGAMENTO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "formasDePagamento" element
     */
    public void removeFormasDePagamento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMASDEPAGAMENTO$0, i);
        }
    }
}
